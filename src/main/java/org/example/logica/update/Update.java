package org.example.logica.update;
import org.example.AdministrativeStaff;
import org.example.ValidateData.IValidateID;
import javax.swing.*;
import java.util.List;

public class Update implements IValidateID {
    public void updateData(List<AdministrativeStaff> employees){
        int id = validID();
        boolean search = false;

        for (AdministrativeStaff employee : employees) {
            if (employee.getIdEmpleado() == id) {
                updateAtribute(employee);
                JOptionPane.showMessageDialog(null, "Update succefull");
                search = true;
                break;
            }

        }
        if(search = false){
            JOptionPane.showMessageDialog(null, "Employee whit id:"+id+"not found");
        }

    }


    public void updateAtribute(AdministrativeStaff employee) {
        int option = 0;

        do{
            String data = JOptionPane.showInputDialog(null, "What is the id of the employee you want to modify" +
                    "\n1. Name: "+employee.getName()+
                    "\n2. Email: "+employee.getEmail()+
                    "\n3. Sex: "+employee.getSex()+
                    "\n4. Rol: "+employee.getPosition()+
                    "\n5. Adress: "+employee.getAdress()+
                    "\n6. Salary: "+employee.getSalary()+
                    "\n7. Don't modify more");

            option = Integer.parseInt(data);
            switch (option) {
                case 1:
                    UpdateName upName = new UpdateName();
                    upName.updateName(employee);
                    break;
                case 2:
                    UpdateEmail upEmail = new UpdateEmail();
                    upEmail.updateEmail(employee);
                    break;
                case 3:
                    UpdateSex  upSex = new UpdateSex();
                    upSex.updateSex(employee);
                    break;
                case 4:
                    UpdateRol upRol = new UpdateRol();
                    upRol.updateRol(employee);
                    break;
                case 5:
                    UpdateAdress upAdress = new UpdateAdress();
                    upAdress.updateAddress(employee);
                    break;
                case 6:
                    UpdateSalary upSalary = new UpdateSalary();
                    upSalary.updateSalary(employee);
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Bye");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option! Please choose a valid option.");
            }
        }while(option != 7);

    }
}
