import java.util.Scanner;
class Segitiga
{
	public static void main(String[] args)
	{
//pendeklarasian bahwa object sc sebagai scanner inputan
		Scanner sc = new Scanner(System.in);
//pernyataan Tipe data dan Variabel nya
		int sudut1,sudut2,sudut3;
//melakukan Inputan dengan pemanggilan object sc sebagai scanner inputan
		System.out.print("Masukkan sudut ke \'1\' \t : ");
		sudut1 = sc.nextInt();
		System.out.print("Masukkan sudut ke \'2\' \t : ");
		sudut2 = sc.nextInt();
		System.out.print("Masukkan sudut ke \'3\' \t : ");
		sudut3 = sc.nextInt();
//Pemilihan dan dilakukannya seleksi bersyarat.
		if(sudut1 > 0 && sudut2 > 0 && sudut3 > 0)
		{
		 //terdapat tanda "!=" mengartikan bahwa 
		//apabila sudut1 + sudut2 + sudut3 hasilnya tidak 180. maka langsung menuju else
			if(sudut1+sudut2+sudut3 != 180)
			{
				System.out.println("Sudut anda kurang dari 180 derajat");
			}
			//Apabila seleksi pertama sudah terpenuhi. maka lanjut pada seleksi ke 2
			//mengartikan bahwa
			//apabila sudut1 + sudut2 , sudut1 + sudut3 , sudut2 + sudut3 tidak menghasilkan 90
			//maka syarat tak terpenuhi dan langsung menuju else
			else if(sudut1+sudut2 == 90 || sudut1+sudut3 == 90 || sudut2+sudut3 == 90)
			{
				System.out.println("SIKU SIKU");
			}
			else
			{
				System.out.println("Bukan SIKU SIKU");
			}
		}
		else
		{
			System.out.println("Sudut tidak boleh negatif");
			System.out.println("Sudut tidak boleh \'0\'");
			System.out.println("");
		}

	}
}