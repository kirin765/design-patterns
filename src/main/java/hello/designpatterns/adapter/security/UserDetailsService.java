package hello.designpatterns.adapter.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
