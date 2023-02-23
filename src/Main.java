public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(20000.0);

        while (true){
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException e){
                try {
                    bankAccount.withDraw((int) e.getRemainingAmount());
                }catch (LimitException ex){
                    ex.printStackTrace();
                }break;
            }
        }
    }
}



//e)  Затем попытаться снять через бесконечный цикл,
// каждую итерацию по 6000 сом, при этом отлавливать исключение LimitException и п
// ри возникновении такого исключения снимать только ту сумму,
// которая осталась на счете и завершать бесконечный цикл