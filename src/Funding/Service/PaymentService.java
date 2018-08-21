package Funding.Service;

import java.util.ArrayList;
import java.util.List;

import Funding.Bean.Payment;
import Funding.Dao.PaymentDao;

public class PaymentService {
private static PaymentDao dao;
private static PaymentService service = new PaymentService();

public static PaymentService getInstance(){
dao =  PaymentDao.getInstance();
	return service;
}


}
