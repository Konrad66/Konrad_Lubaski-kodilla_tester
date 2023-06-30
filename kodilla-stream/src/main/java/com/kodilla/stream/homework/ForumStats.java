package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        System.out.println(averageNumberOfPostsForOneGroup());
        System.out.println(averageNumberOfPostsForSecondGroup());
    }

    public static double averageNumberOfPostsForOneGroup(){
        double avg = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToDouble(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return avg;
    }

    public static double averageNumberOfPostsForSecondGroup(){
        double avg = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToDouble(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return avg;
    }

}