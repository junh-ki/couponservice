package com.jun.springcloud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jun.springcloud.model.Coupon;
import com.jun.springcloud.repos.CouponRepo;

@RestController
@RequestMapping("/couponapi")
public class CouponRestController {
	
	@Autowired
	private CouponRepo repo;
	
	@RequestMapping(value="/coupons", method=RequestMethod.POST)
	public Coupon create(Coupon coupon) {
		return repo.save(coupon);
	}
	
	@RequestMapping(value="/coupons/{code}", method=RequestMethod.GET)
	public Coupon getCoupon(String code) {
		return repo.findByCode(code);
	}
	
}