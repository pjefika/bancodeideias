/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.bancodeideias.test;

import bancodeideias.dal.ColaboradorDAO;
import bancodeideias.model.viewmodel.Colaborador;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author G0042204
 */
public class ConsultarColaboradorJUnitTest {

    private ColaboradorDAO dao = new ColaboradorDAO();

    public ConsultarColaboradorJUnitTest() {
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
    public void consultarColaborador() {
        String login = "G0042204";
        Colaborador colab = dao.consultar(login);
        Assert.assertTrue(!colab.getNome().isEmpty());
    }
}
