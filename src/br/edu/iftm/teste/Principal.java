package br.edu.iftm.teste;

import br.edu.iftm.classes.Album;

public class Principal 
{
    public static void main(String[] args)
    {
        Album rush = new Album("LP Rush Moving Pictures", 304.62f, 1981);
        
        rush.detalhes();
    }  
}