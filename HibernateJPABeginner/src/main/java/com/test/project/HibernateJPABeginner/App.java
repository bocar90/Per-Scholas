package com.test.project.HibernateJPABeginner;

import com.test.hib.controller.FindUser_Hql;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FindUser_Hql newUser = new FindUser_Hql();
        //newUser.findUser();
        //newUser.findUSerSelect();
        //newUser.getRecordbyId();
        //newUser.getRecords();
        //newUser.getMaxSalary();
        //newUser.getMaxSalaryGroupBy();
        newUser.NamedQueryExample();
    }
}
