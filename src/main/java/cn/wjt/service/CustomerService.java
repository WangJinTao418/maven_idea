package cn.wjt.service;

import cn.wjt.entity.Customer;

public interface CustomerService {
    public Customer findCustomerById(Integer id);

    public Customer findCustomers();
}
