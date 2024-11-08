package com.travelport.demospringboot.services;

import com.travelport.demospringboot.entities.User;
import com.travelport.demospringboot.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public List<User> findByNameOrCarBrand(String name, String cardBrand) {
    return userRepository.findAll();
  }

  @Override
  public Optional<User> findById(Integer id) {
    return userRepository.findById(id);
  }

  @Override
  public void deleteById(Integer id) {
    userRepository.deleteById(id);
  }

  @Override
  public User save(User user) {
    return userRepository.save(user);
  }

  @Override
  public User update(Integer id, User user) {
    return userRepository.save(user);
  }
}
