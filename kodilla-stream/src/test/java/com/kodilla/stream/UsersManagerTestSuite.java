package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UsersManagerTestSuite {
    private UsersManager usersManager = new UsersManager();

    @Test
    public void testFilterChemistGroupUsernames(){
        //given
        UsersRepository.getUserList();
        //then
        List<String> result = UsersManager.filterChemistGroupUsernames();
        //then
        assertEquals(2, result.size());
    }

    @Test
    public void testFilterAgeGroupUserAge(){
        //given
        UsersRepository.getUserList();
        //then
        List<Integer> result = UsersManager.filterAgeGroupUserAge();
        //then
        assertEquals(3, result.size());
    }

    @Test
    public void testFilterInfoGroupUsername(){
        //given
        UsersRepository.getUserList();
        //then
        List<Integer> result = UsersManager.filterInfoGroupUsername();
        //then
        assertEquals(4,result.size());
    }
}