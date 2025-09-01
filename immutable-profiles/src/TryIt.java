import com.example.profiles.*;

public class TryIt {
    public static void main(String[] args) {
        ProfileService svc = new ProfileService();
        UserProfile p1 = svc.createMinimal("u1", "a@b.com");
        System.out.println("Minimal: " + p1);

        UserProfile p2 = new UserProfile.Builder("u1", "a@b.com")
                .displayName("John Doe")
                .phone("123456789")
                .marketingOptIn(true)
                .github("alicehub")
                .build();

        System.out.println("Full:  " + p2);
        System.out.println("Email stays constant: " + p1.getEmail());

        System.out.println("=> In the solution, this setter disappears and object becomes immutable.");
    }
}
