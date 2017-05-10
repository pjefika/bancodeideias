/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.bancodeideias.test;

import org.junit.*;
import vraptor_suporten2.dal.IdeiaDAO;
import vraptor_suporten2.model.entitiy.Ideia;
import vraptor_suporten2.model.entitiy.InterfaceDAO;

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
    }

    @After
    public void tearDown() {
    }

    @Test
    public void cadastreSuaIdeia() {

        try {

            dao = new IdeiaDAO();
            Ideia i = new Ideia();

            i.setDescComo("Como");
            i.setDescricao("Desc");
            i.setGanhos("Ganhos");
            i.setLoginCriador("G0042204");

            i = dao.cadastrar(i);

            Assert.assertTrue(true);
            System.out.println("");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
