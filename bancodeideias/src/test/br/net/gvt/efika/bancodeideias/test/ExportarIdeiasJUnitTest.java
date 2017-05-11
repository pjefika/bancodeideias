/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.bancodeideias.test;

import bancodeideias.dal.IdeiaDAO;
import bancodeideias.dal.InterfaceDAO;
import bancodeideias.model.entitiy.Ideia;
import bancodeideias.model.viewmodel.Relatorio;
import java.util.Calendar;
import java.util.List;
import org.junit.*;

/**
 *
 * @author G0042204
 */
public class ExportarIdeiasJUnitTest {

    private InterfaceDAO<Ideia> dao;

    public ExportarIdeiasJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        dao = new IdeiaDAO();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void exportarIdeias() {

        try {

            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.HOUR, 0);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.SECOND, 0);
//            System.out.println(cal.getTime());
//            System.out.println(Calendar.getInstance().getTime());

            Relatorio r = new Relatorio();
            r.setDataInicio(cal.getTime());
            r.setDataFinal(Calendar.getInstance().getTime());

            List<Ideia> lst = dao.listar(r);
            for (Ideia ideia : lst) {
                System.out.println(ideia.getDescricao());
            }
            Assert.assertTrue(!lst.isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
