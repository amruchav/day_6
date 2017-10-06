package com.cg.bank.Service;


import com.cg.bank.DAO.CustomerDAOImpl;
import com.cg.bank.DAO.ICustomerDAO;
import com.cg.bank.bean.CustomerBean;

public class CustomerServiceImpl implements ICustomerService {
	
		ICustomerDAO dao=null;
	public int addDetails(CustomerBean bean){
		dao=new CustomerDAOImpl();
		return dao.addDetails(bean);
	
		
	}

}
