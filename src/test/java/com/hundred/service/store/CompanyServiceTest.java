package com.hundred.service.store;

import com.github.pagehelper.PageInfo;
import com.hundred.domain.store.Company;
import com.hundred.service.store.impl.CompanyServiceImpl;
import org.junit.*;

import java.util.List;

public class CompanyServiceTest {
    public static CompanyService companyService = null;
    @BeforeClass
    public static void init(){
        companyService = new CompanyServiceImpl();
    }

    @Test
    public void testSave(){
        Company company = new Company();
        company.setName("测试数据");
        companyService.save(company);
    }

    @Test
    public void testFindAllByPage(){
        PageInfo pageInfo = companyService.findAll(1,100);
        System.out.println(pageInfo);
    }

    @Test
    public void testFindAll(){
        List<Company> all = companyService.findAll();
        System.out.println(all);
    }

    @AfterClass
    public static void destroy(){
        companyService = null;
    }
}
