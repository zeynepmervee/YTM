using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace YTM
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Ferrari ferrari = new Ferrari(0, 0);
            Console.WriteLine("FERRARI:");
            ferrari.Power();
            Console.WriteLine("Aracin baslangic hizi: " + ferrari.GetVelocity());
            ferrari.Run();
            Console.WriteLine("Aracin calistiktan sonraki hizi: " + ferrari.GetVelocity());
            ferrari.Boost();
            ferrari.Run();
            Console.WriteLine("Aracin boostlandiktan sonraki hizi: " + ferrari.GetVelocity());
            ferrari.Open();
            ferrari.Run();
            Console.WriteLine("Aracin klima acildiktan sonraki hizi: " + ferrari.GetVelocity());

            Mercedes mercedes = new Mercedes(0, 0);
            Console.WriteLine("MERCEDES:");
            mercedes.Power();
            Console.WriteLine("Aracin baslangic hizi: " + mercedes.GetVelocity());
            mercedes.Run();
            Console.WriteLine("Aracin calistiktan sonraki hizi: " + mercedes.GetVelocity());
            mercedes.Boost();
            mercedes.Run();
            Console.WriteLine("Aracin boostlandiktan sonraki hizi: " + mercedes.GetVelocity());

            Tofas tofas = new Tofas(0, 0);
            Console.WriteLine("TOFAS:");
            tofas.Power();
            Console.WriteLine("Aracin baslangic hizi: " + tofas.GetVelocity());
            tofas.Run();
            Console.WriteLine("Aracin calistiktan sonraki hizi: " + tofas.GetVelocity());
            tofas.Open();
            tofas.Run();
            Console.WriteLine("Aracin klima acildiktan sonraki hizi: " + tofas.GetVelocity());
        }
    }
}