/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.bancodeideias.test;

import bancodeideias.dal.IdeiaDAO;
import bancodeideias.model.entitiy.Ideia;
import bancodeideias.model.entitiy.InterfaceDAO;
import java.util.List;
import org.junit.*;

/**
 *
 * @author G0042204
 */
public class IdeiasCastradasJUnitTest {

    private InterfaceDAO<Ideia> dao;

    public IdeiasCastradasJUnitTest() {
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
    public void ideiasCastradas() {

        try {
            List<Ideia> lst = dao.listar();
            for (Ideia ideia : lst) {
                System.out.println(ideia.getDescricao());
            }
            Assert.assertTrue(!lst.isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
