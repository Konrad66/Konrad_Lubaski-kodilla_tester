package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);

        List<Integer> ageGroupUserAge = filterAgeGroupUserAge();
        System.out.println(ageGroupUserAge);

        List<Integer> infoUsername = filterInfoGroupUsername();
        System.out.println(infoUsername);
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

    public static List<Integer> filterAgeGroupUserAge(){
        List<Integer> age = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() >= 45)
                .map(user -> user.getAge())
                .collect(Collectors.toList());
        return age;
    }

    public static List<Integer> filterInfoGroupUsername(){
        List<Integer> userInfo = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getNumberOfPost() <= 10)
                .map(user -> user.getNumberOfPost())
                .collect(Collectors.toList());
        return  userInfo;
    }

    public static String getUserName(User user) {
        return user.getUserName();
    }
}