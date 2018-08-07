package cn.wjt.service.impl;

import cn.wjt.dao.CustomerDao;
import cn.wjt.entity.Customer;
import cn.wjt.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public Customer findCustomerById(Integer id) {
        return customerDao.findCustomerById(id);
    }

    @Override
    public Customer findCustomers() {
        return customerDao.findCustomers();
    }
}
