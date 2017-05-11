/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.bancodeideias.test;

import bancodeideias.dal.IdeiaDAO;
import bancodeideias.model.entitiy.Ideia;
import bancodeideias.dal.InterfaceDAO;
import org.junit.*;

/**
 *
 * @author G0042204
 */
public class CadastreSuaIdeiaJUnitTest {

    private InterfaceDAO<Ideia> dao;

    public CadastreSuaIdeiaJUnitTest() {
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
    public void cadastreSuaIdeia() {

        try {
            Ideia i = new Ideia();

            i.setDescComo("Como");
            i.setDescricao("Desc");
            i.setGanhos("Ganhos");
            i.setLoginCriador("G0042204");

            i = dao.cadastrar(i);

            Assert.assertTrue(i.getId() != null);
            System.out.println(i.getId());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
