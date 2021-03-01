import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, BankAccount> accounts = new HashMap<>();

        String line = reader.readLine();

        while (!"End".equals(line)){
            String[] lineCommand = line.split("\\s+");
            int ID = Integer.parseInt(lineCommand[1]);
            switch (lineCommand[0]){
                case "Create":
                    if (accounts.containsKey(ID)){
                        System.out.println("Account already exists");
                    }else {
                        BankAccount bankAccount = new BankAccount();
                        bankAccount.setId(ID);
                        accounts.put(ID, bankAccount);
                    }
                    break;
                case "Deposit":
                    double depositAmount = Double.parseDouble(lineCommand[2]);
                    if (accounts.get(ID) == null){
                        System.out.println("Account does not exist");
                        break;
                    }
                   accounts.get(ID).deposit(depositAmount);
                    break;
                case "Withdraw":
                    double withdrawAmount = Double.parseDouble(lineCommand[2]);
                    BankAccount bankAccount = accounts.get(ID);
                    if (accounts.get(ID) == null){
                        System.out.println("Account does not exist");
                        break;
                    }
                    if (bankAccount != null){
                        if (bankAccount.getBalance() < withdrawAmount){
                            System.out.println("Insufficient balance");
                        }else {
                            bankAccount.withdraw(withdrawAmount);
                        }
                    }
                    break;
                case "Print":
                    if (accounts.get(ID) == null){
                        System.out.println("Account does not exist");
                        break;
                    }
                    System.out.println(accounts.get(ID).toString());
                    break;
            }

            line = reader.readLine();
        }
    }
}
