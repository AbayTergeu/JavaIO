package com.abter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Long currentUserId = 5L;
        Integer userId = 5;
        if(currentUserId.equals(userId.longValue())){
            System.out.println( "Equals!" );
        }
        System.out.println( "Hello World!" );
    }
}
