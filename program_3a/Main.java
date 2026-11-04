import java.util.Scanner;

abstract class EnergySource { 
    int sourceId; 
    String sourceName; 
    double energyGenerated; 

    EnergySource(int sourceId, String sourceName, double energyGenerated) { 
        this.sourceId = sourceId; 
        this.sourceName = sourceName; 
        this.energyGenerated = energyGenerated; 
    } 

    abstract double calculateEfficiency(); 

    void display() { 
        System.out.println("Source ID: " + sourceId); 
        System.out.println("Source Name: " + sourceName); 
        System.out.println("Energy Generated: " + energyGenerated); 
        System.out.println("Calculated Efficiency = " + calculateEfficiency() + "%"); 
        System.out.println(); 
    } 
} 

class SolarEnergy extends EnergySource { 
    SolarEnergy(int sourceId, String sourceName, double energyGenerated) { 
        super(sourceId, sourceName, energyGenerated); 
    } 

    @Override 
    double calculateEfficiency() { 
        return (energyGenerated / 5000) * 100; 
    } 
} 

class WindEnergy extends EnergySource { 
    WindEnergy(int sourceId, String sourceName, double energyGenerated) { 
        super(sourceId, sourceName, energyGenerated); 
    } 

    @Override 
    double calculateEfficiency() { 
        return (energyGenerated / 8000) * 100; 
    } 
} 

public class Main { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter Solar source ID: "); 
        int id1 = sc.nextInt(); 
        
        System.out.print("Enter Solar source name: "); 
        sc.nextLine(); 
        String name1 = sc.nextLine(); 
        
        System.out.print("Enter Solar energy generated: "); 
        double energy1 = sc.nextDouble(); 
        
        System.out.print("Enter Wind source ID: "); 
        int id2 = sc.nextInt(); 
        
        System.out.print("Enter Wind source name: "); 
        sc.nextLine(); 
        String name2 = sc.nextLine(); 
        
        System.out.print("Enter Wind energy generated: "); 
        double energy2 = sc.nextDouble(); 
        
        System.out.println("\n--- Displaying Results ---\n");

        EnergySource source; 
        
        source = new SolarEnergy(id1, name1, energy1); 
        source.display(); 
        
        source = new WindEnergy(id2, name2, energy2); 
        source.display(); 
        
        sc.close(); 
    } 
}
