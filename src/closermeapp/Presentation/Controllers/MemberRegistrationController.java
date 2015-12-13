package closermeapp.Presentation.Controllers;

import closermeapp.Bussiness.DebtCollector.DebtCollector;
import closermeapp.Bussiness.Entities.Member;
import closermeapp.Bussiness.MemberManager.MembersManager;
import closermeapp.Presentation.Util.Notifier;
import closermeapp.Presentation.Views.VisitorManagement.MemberRegistrationView;

public class MemberRegistrationController extends AbstractViewController {
    private MemberRegistrationView memberRegistrationView;
    private MembersMenuController membersMenuController;
    private ChargeController chargeController;
    private DebtCollector debtCollector;
    private Notifier notifier;
    private MembersManager membersManager;

    public MemberRegistrationController(MembersMenuController membersMenuController) {
        this.memberRegistrationView = new MemberRegistrationView();
        this.debtCollector = DebtCollector.getDebtCollector();
        this.notifier = new Notifier();
        this.membersMenuController = membersMenuController;
        this.chargeController = new ChargeController();
        this.membersManager = MembersManager.getMembersManager();

        initializeView();
    }

    public void openWindow() {
        memberRegistrationView.setVisible(true);
    }


    private void registerMemberData() {
        String name = memberRegistrationView.getMemberNameTextBox().getText();
        String phone = memberRegistrationView.getMemberPhoneTextBox().getText();
        String cellphone = memberRegistrationView.getMemberCellPhoneTextBox().getText();
        String address = getFormattedAddress();
        String membershipType = (String) memberRegistrationView.getMembershipTypeComboBox().getSelectedItem();
        String message;
        try {

            double discount = Double.parseDouble(memberRegistrationView.getMembershipDiscountTextBox().getText());

            if (isEmptyFields(name, phone, cellphone, address)) {
                message = "Por favor rellene todos los campos";
                notifier.showWarningMessage(message);
            } else {
                sendMemberDataToManager(name, phone, cellphone, address, membershipType, discount);
            }

        } catch (NumberFormatException numberFormatException) {
            message = "Ingrese un descuento valido";
            notifier.showFailMessage(message);
        }
    }

    private String getFormattedAddress() {
        String whiteSpace = " ";

        String address = memberRegistrationView.getMemberAddressStreetTextBox().getText() +
                whiteSpace + memberRegistrationView.getMemberAddressNumberTextBox().getText() +
                whiteSpace + memberRegistrationView.getMemberAddressFirstSideTextBox().getText() +
                whiteSpace + memberRegistrationView.getAndWordLabel().getText() +
                whiteSpace + memberRegistrationView.getMemberAddressSecondSideTextBox().getText() +
                whiteSpace + memberRegistrationView.getMemberAddressNeighborTextBox().getText();
        return address;
    }

    private boolean isEmptyFields(String name, String phone, String cellphone, String address) {
        return (name.isEmpty() || phone.isEmpty() || cellphone.isEmpty() || address.isEmpty());
    }

    private void sendMemberDataToManager(
            String name,
            String phone,
            String cellphone,
            String address,
            String membershipType,
            Double discount
    ) {

        Member member = membersManager.createMember(name, phone, address, cellphone, membershipType, discount);
        membersManager.addMember(member);
        notifier.showSuccessMessage("Agregado", "Miembro agregado correctamente");
        double totalCharge = getTotalCharge(member, discount);
        windowsUpdate(member, totalCharge);

    }

    private void resetFields() {
        String whiteSpace = "";
        String defaultDiscount = "0";
        this.memberRegistrationView.getMemberAddressFirstSideTextBox().setText(whiteSpace);
        this.memberRegistrationView.getMemberAddressNeighborTextBox().setText(whiteSpace);
        this.memberRegistrationView.getMemberAddressNumberTextBox().setText(whiteSpace);
        this.memberRegistrationView.getMemberAddressSecondSideTextBox().setText(whiteSpace);
        this.memberRegistrationView.getMemberAddressStreetTextBox().setText(whiteSpace);
        this.memberRegistrationView.getMemberCellPhoneTextBox().setText(whiteSpace);
        this.memberRegistrationView.getMemberNameTextBox().setText(whiteSpace);
        this.memberRegistrationView.getMemberPhoneTextBox().setText(whiteSpace);
        this.memberRegistrationView.getMembershipDiscountTextBox().setText(defaultDiscount);
    }

    private void CancelButton() {
        closeWindow();
    }


    private void windowsUpdate(Member member, double totalCharge) {
        resetFields();
        membersMenuController.addMemberToTable(member);
        chargeController.setTotalChargeMessage(totalCharge);
        showChargeView();
    }

    private double getTotalCharge(Member member, double discount) {

        double totalCharge = debtCollector.chargeTheMember(member, discount);
        return totalCharge;
    }

    private void showChargeView() {
        chargeController.openWindow();
    }

    private void closeWindow() {
        memberRegistrationView.dispose();
    }

    private void setDefaultDiscount() {
        String defaultDiscount = "0";
        memberRegistrationView.getMembershipDiscountTextBox().setText(defaultDiscount);
    }

    @Override
    protected void initializeView() {
        configureWindow(memberRegistrationView);
        setDefaultDiscount();
        setEvents();
    }

    @Override
    protected void setEvents() {
        memberRegistrationView.getRegisterMemberButton().addActionListener(actionEvent -> registerMemberData());
        memberRegistrationView.getCancelButton().addActionListener(actionEvent -> CancelButton());

    }

}
