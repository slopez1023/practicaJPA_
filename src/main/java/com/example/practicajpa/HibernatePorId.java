package com.example.practicajpa;

import com.example.practicajpa.utils.JpaUtil;
import jakarta.persistence.EntityManager;

import java.util.Scanner;

public class HibernatePorId {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el id: ");
        Long id = s.nextLong();
        EntityManager em = JpaUtil.getEntityManager();
        Cliente cliente = em.find(Cliente.class, id);
        System.out.println(cliente);

        Cliente cliente2 = em.find(Cliente.class,id);
        System.out.println(cliente2);

        em.close();
    }
}
