package Viva3_Thur.Q1;

import java.util.Random;

public class Phantom {
    private float accuracy;
    private float critRate;

    // Empty constructor
    public Phantom() {
        this.accuracy = 1.0f;
        this.critRate = 1.0f;
    }

    // Main constructor with validation
    public Phantom(float accuracy, float critRate) {
        setAccuracy(accuracy);
        setCritRate(critRate);
    }

    // Accessor methods
    public float getAccuracy() {
        return accuracy;
    }

    public float getCritRate() {
        return critRate;
    }

    // Mutator methods with range validation
    public void setAccuracy(float accuracy) {
        if (accuracy >= 0.0f && accuracy <= 1.0f) {
            this.accuracy = accuracy;
        } else {
            this.accuracy = 1.0f;
        }
    }

    public void setCritRate(float critRate) {
        if (critRate >= 0.0f && critRate <= 1.0f) {
            this.critRate = critRate;
        } else {
            this.critRate = 1.0f;
        }
    }

    // Damage calculation method
    int damage(BlackMage blackMage) {
        float effectiveAccuracy = this.accuracy * (1 - blackMage.evasion);
        float effectiveCritRate = this.critRate - blackMage.critResistance;

        Random r = new Random();
        float hitChance = r.nextFloat();

        if (hitChance <= effectiveAccuracy) {
            float critChance = r.nextFloat();
            if (critChance <= effectiveCritRate) {
                return 4; // Critical hit
            } else {
                return 2; // Normal hit
            }
        } else {
            return 0; // Miss
        }
    }

    // Combat log output
    @Override
    public String toString() {
        String battleLog = "The epic battle begins!\n";
        BlackMage blackMage = new BlackMage();

        while (blackMage.hp > 0) {
            int dealtDamage = damage(blackMage);
            blackMage.hp -= dealtDamage;

            if (blackMage.hp < 0) {
                blackMage.hp = 0;
            }

            switch (dealtDamage) {
                case 0:
                    battleLog += "[MISS] Phantom has dealt 0 damage to the Black Mage (" + blackMage.hp + "/100)\n";
                    break;
                case 2:
                    battleLog += "[NORM] Phantom has dealt 2 damage to the Black Mage (" + blackMage.hp + "/100)\n";
                    break;
                case 4:
                    battleLog += "[CRIT] Phantom has dealt 4 damage to the Black Mage (" + blackMage.hp + "/100)\n";
                    break;
            }
        }

        battleLog += "The Battle Mage is defeated...";
        return battleLog;
    }
}
