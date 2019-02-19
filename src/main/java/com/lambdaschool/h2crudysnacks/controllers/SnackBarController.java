package com.lambdaschool.h2crudysnacks.controllers;

import com.lambdaschool.h2crudysnacks.models.Customer;
import com.lambdaschool.h2crudysnacks.models.Snack;
import com.lambdaschool.h2crudysnacks.models.VendingMachine;
import com.lambdaschool.h2crudysnacks.repositories.CustomerRepository;
import com.lambdaschool.h2crudysnacks.repositories.SnackRepository;
import com.lambdaschool.h2crudysnacks.repositories.VendingMachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = {}, produces = MediaType.APPLICATION_JSON_VALUE)
public class SnackBarController {
  @Autowired
  CustomerRepository customerRepo;

  @Autowired
  SnackRepository snackRepo;

  @Autowired
  VendingMachineRepository vendingRepo;

  @GetMapping("/customer")
  public List<Customer> findAllCustomers() {
    return customerRepo.findAll();
  }

  @GetMapping("/customer/name/{name}")
  public Customer findCustomerByName(@PathVariable String name) {
    return customerRepo.findByName(name);
  }

  @GetMapping("/snack")
  public List<Snack> findAllSnacks() {
    return snackRepo.findAll();
  }

  @GetMapping("snack/vending")
  public List<Object[]> vendingSnacks() {
    return snackRepo.vendingSnacks();
  }

  @GetMapping("/vending")
  public List<VendingMachine> findAllVendingMachines() {
    return vendingRepo.findAll();
  }

  @GetMapping("/vending/{name}")
  public List<VendingMachine> findVendingMachinesByName(@PathVariable String name) {
    return vendingRepo.findByName(name);
  }
}
