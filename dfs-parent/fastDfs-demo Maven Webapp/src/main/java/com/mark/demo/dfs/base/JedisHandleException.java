package com.mark.demo.dfs.base;


public class JedisHandleException extends RuntimeException
{
    //
    private static final long serialVersionUID = 8149861602527033152L;
    
    public JedisHandleException()
    {
        super();
    }
    
    public JedisHandleException(String s)
    {
        super(s);
    }
    
    public JedisHandleException(Throwable e)
    {
        super(e);
    }
}
