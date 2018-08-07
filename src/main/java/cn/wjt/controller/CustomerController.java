package cn.wjt.controller;
import cn.wjt.entity.Customer;
import cn.wjt.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	/**
	 * 根据id查询客户详情
	 */
	@RequestMapping(value = "/findCustomerById/{id}")
	public ModelAndView findCustomerById(@PathVariable Integer id) {
		ModelAndView model=new ModelAndView();
		Customer customer = customerService.findCustomerById(id);
		model.addObject("customer", customer);
		model.setViewName("customer");
		//返回客户信息展示页面
		return model;
	}
}
