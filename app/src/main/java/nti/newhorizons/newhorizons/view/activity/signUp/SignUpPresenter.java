package nti.newhorizons.newhorizons.view.activity.signUp;

import nti.newhorizons.newhorizons.data.entities.Client;

public class SignUpPresenter {

    private Client getClient(String name,String email,String password,String phone){
        Client  client=new Client();
        client.getPerson().setName(name);
        client.getPerson().setPhone(phone);
        client.getPerson().setEmail(email);
        client.setPassword(password);
        return client;
    }

    private boolean saveClient(String name,String email,String password,String phone){
        Client  client=new Client();
        client= getClient( name, email, password, phone);
        return true;
    }
}
