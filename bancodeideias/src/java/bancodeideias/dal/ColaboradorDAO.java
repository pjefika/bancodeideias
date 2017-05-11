/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodeideias.dal;

import bancodeideias.model.viewmodel.Colaborador;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author G0042204
 */
public class ColaboradorDAO extends AbstractDAO {

    public Colaborador consultar(String login) {
        try {
            URL url = new URL("http://efika/web/services/colaborador/?login=" + login);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String out = in.readLine();
            System.out.println("out: " + out);
            Colaborador c = this.parse(out);
            in.close();
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Colaborador parse(String xml) {

        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(Colaborador.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            StringReader reader = new StringReader(xml);
            Colaborador colab = (Colaborador) unmarshaller.unmarshal(reader);
            return colab;
        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }

    }
}
