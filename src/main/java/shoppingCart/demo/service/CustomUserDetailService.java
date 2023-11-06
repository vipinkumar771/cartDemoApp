//package shoppingCart.demo.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import shoppingCart.demo.entities.CustomUserDetail;
//import shoppingCart.demo.entities.User;
//import shoppingCart.demo.repository.UserRepository;
//
//import java.util.Optional;
//@Service
//public class CustomUserDetailService implements UserDetailsService {
//    @Autowired
//    UserRepository userRepository;
//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        Optional<User> user = userRepository.findUserByEmail(email);
//        user.orElseThrow(()-> new UsernameNotFoundException("User Not found"));
//        return user.map(CustomUserDetail::new).get();
//    }
//}
