/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import javax.naming.InitialContext;
import javax.sql.DataSource;


public class connection {
    private DataSource ds;
    public DataSource getDs() throws Exception
    {
        InitialContext ctx= new InitialContext();
        ds=(DataSource)ctx.lookup("pratul");
        return ds;
    }
    
}
