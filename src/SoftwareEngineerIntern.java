/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User
 */
public interface SoftwareEngineerIntern {
    public abstract void coding();
}


class JavaWebDeveloperIntern implements SoftwareEngineerIntern{

    @Override
    public void coding() {
        System.out.println("Java Web Developing (Intern)");
    }


}