package web.service;

import web.model.Car;

import java.util.List;

public interface UserService {
    void add(Car car);

    List listCarsByCriteria();
}
