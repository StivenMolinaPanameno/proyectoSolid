package org.example.logica;

import org.example.AdministrativeStaff;
import org.example.Register;
import org.example.logica.delete.Delete;
import org.example.logica.search.Search;
import org.example.logica.update.Update;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    int option = 0;
    String generic;
    public void menu() {
        List<AdministrativeStaff> employees = new ArrayList<>();
        EmpleadosAgregados agregarAutom = new EmpleadosAgregados();
        agregarAutom.empleadosAgregados(employees);
        do {
            generic = JOptionPane.showInputDialog(null, "Choose one of the options: " +
                    "\n1. Search employees" +
                    "\n2. Register employees" +
                    "\n3. Delete employees" +
                    "\n4. Modify employees" +
                    "\n5. Show all employees" +
                    "\n6. Exit");
            option = Integer.parseInt(generic);
            switch (option) {
                case 1:
                    Search search = new Search();
                    search.buscar(employees);
                    break;
                case 2:
                    Register rgstr = new Register();
                    rgstr.Data(employees);
                    break;
                case 3:
                    Delete dltEmployee = new Delete();
                    dltEmployee.deleteData(employees);
                    break;
                case 4:
                    Update update = new Update();
                    update.updateData(employees);
                    break;
                case 5:
                    ShowEmployees show = new ShowEmployees();
                    show.showData(employees);
                    break;
                case 6:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option! Please choose a valid option.");
                }

            }
            while (option != 6) ;


        }


    }