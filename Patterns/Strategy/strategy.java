abstract class Character {
	WeaponBehavior weapon;
	abstract void setWeapon(WeaponBehavior weapon);
	abstract void fight();
}

@FunctionalInterface
interface WeaponBehavior {
	void useWeapon();
}

class King extends Character {
	void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}

	@Override
	void fight() {
		System.out.print("The King uses ");
		weapon.useWeapon();
	}
}

class Queen extends Character {
	void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}

	@Override
	void fight() {
		System.out.print("The Queen uses ");
		weapon.useWeapon();
	}
}

class Knight extends Character {
	void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}

	@Override
	void fight() {
		System.out.print("The Knight uses ");
		weapon.useWeapon();
	}
}

class SwordBehavior implements WeaponBehavior {
	@Override
	public void useWeapon() {
		System.out.println("a sword and hits 20 HP");
	}
}

public class strategy {
	public static void main(String... args) { 
		Character char1 = new King();
		char1.setWeapon(new SwordBehavior());
		
		Character char2 = new Knight();
		char2.setWeapon(() -> System.out.println("an axe and hits 40 HP"));
		
		Character char3 = new Queen();
		char3.setWeapon(new SwordBehavior() {
			@Override
			public void useWeapon() {
				System.out.println("a knife and hits 10 HP");
			}
		});

		char1.fight();
		char2.fight();
		char3.fight();
	}
}
