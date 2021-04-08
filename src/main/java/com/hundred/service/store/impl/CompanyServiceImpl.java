package com.hundred.service.store.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hundred.dao.store.CompanyDao;
import com.hundred.domain.store.Company;
import com.hundred.factory.MapperFactory;
import com.hundred.service.store.CompanyService;
import com.hundred.utils.TransactionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.UUID;

public class CompanyServiceImpl implements CompanyService {
    @Override
    public void save(Company company) {
        SqlSession sqlSession = null;
        try {
            //获取sqlsession
            sqlSession = MapperFactory.getSqlSession();
            //获取mapper
            CompanyDao mapper = MapperFactory.getMapper(sqlSession, CompanyDao.class);
            //获取UUID
            String id = UUID.randomUUID().toString();
            company.setId(id);
            //调用dao层操作
            mapper.save(company);
            //提交事务
            TransactionUtil.commit(sqlSession);
        } catch (Exception e) {
            TransactionUtil.rollback(sqlSession);
            throw new RuntimeException(e);
        }finally {
            try {
                TransactionUtil.close(sqlSession);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void delete(Company company) {
        SqlSession sqlSession = null;
        try{
            sqlSession = MapperFactory.getSqlSession();
            CompanyDao mapper = MapperFactory.getMapper(sqlSession, CompanyDao.class);
            mapper.delete(company);
            TransactionUtil.commit(sqlSession);
        } catch (Exception e) {
            TransactionUtil.rollback(sqlSession);
            throw new RuntimeException(e);
        }finally {
            try {
                TransactionUtil.close(sqlSession);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void update(Company company) {
        SqlSession sqlSession = null;
        try{
            sqlSession = MapperFactory.getSqlSession();
            CompanyDao mapper = MapperFactory.getMapper(sqlSession, CompanyDao.class);
            mapper.update(company);
            TransactionUtil.commit(sqlSession);
        } catch (Exception e) {
            TransactionUtil.rollback(sqlSession);
            throw new RuntimeException(e);
        }finally {
            try {
                TransactionUtil.close(sqlSession);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public Company findById(String id) {
        SqlSession sqlSession = null;
        try{
            sqlSession = MapperFactory.getSqlSession();
            CompanyDao mapper = MapperFactory.getMapper(sqlSession, CompanyDao.class);
            return mapper.findById(id);
        } catch (Exception e) {
            TransactionUtil.rollback(sqlSession);
            throw new RuntimeException(e);
        }finally {
            try {
                TransactionUtil.close(sqlSession);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            return null;
        }
    }

    @Override
    public List<Company> findAll() {
        SqlSession sqlSession = null;
        try{
            sqlSession = MapperFactory.getSqlSession();
            CompanyDao mapper = MapperFactory.getMapper(sqlSession, CompanyDao.class);
            return mapper.findAll();
        } catch (Exception e) {
            TransactionUtil.rollback(sqlSession);
            throw new RuntimeException(e);
        }finally {
            try {
                TransactionUtil.close(sqlSession);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public PageInfo findAll(int page, int size) {
        SqlSession sqlSession = null;
        try{
            sqlSession = MapperFactory.getSqlSession();
            CompanyDao mapper = MapperFactory.getMapper(sqlSession, CompanyDao.class);
            PageHelper.startPage(page,size);
            List<Company> all = mapper.findAll();
            PageInfo pageInfo = new PageInfo(all);
            return pageInfo;
        } catch (Exception e) {
            TransactionUtil.rollback(sqlSession);
            throw new RuntimeException(e);
        }finally {
            try {
                TransactionUtil.close(sqlSession);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
