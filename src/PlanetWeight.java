class PlanetWeight
{
    public static void main(String[] args)
    {
        System.out.print("Your weight on earth is ");
        double weight = 205;
        System.out.println(weight);
 
        System.out.print("Your weight on mercury is ");
        double mercury = weight * .378;
        System.out.println(mercury);
        
        System.out.print("Your weight on the moon is ");
        double moon = weight * .166;
        System.out.println(moon);
        
        System.out.print("Your weight on jupiter is ");
        double jupiter = weight * 2.364;
        System.out.println(jupiter);
    }
}