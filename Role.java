package placement;

public class Role {
    String roleName;
    String skills;
    String preparationTips;

    Role(String roleName, String skills, String preparationTips) {
        this.roleName = roleName;
        this.skills = skills;
        this.preparationTips = preparationTips;
    }

    void displayRoleInfo() {
        System.out.println("Role: " + roleName);
        System.out.println("Skills Required: " + skills);
        System.out.println("Preparation Tips: " + preparationTips);
        System.out.println("-------------------------");
    }
}