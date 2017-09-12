package com.mark.demo.dfs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mark.demo.dfs.base.GenericServiceImpl;
import com.mark.demo.dfs.constant.ClientKeyConst;
import com.mark.demo.dfs.entity.ClientKey;
import com.mark.demo.dfs.mapper.ClientKeyMapper;
import com.mark.demo.dfs.service.ClientKeyService;


@Service
public class ClientKeyServiceImpl extends GenericServiceImpl<ClientKey> implements ClientKeyService
{
    private ClientKeyMapper clientKeyMapper;
    
    @Autowired(required = true)
    public ClientKeyServiceImpl(ClientKeyMapper clientKeyMapper)
    {
        super(clientKeyMapper);
        this.clientKeyMapper = clientKeyMapper;
    }
    
    @Override
    public ClientKey findByKey(String key)
    {
        return clientKeyMapper.findByKey(ClientKeyConst.CLIENT_KEY, key);
    }
    
    @Override
    public Boolean isExistNetAddress(String key, String accessType, Integer ip)
    {
        ClientKey clientKey = clientKeyMapper.isExistNetAddress(key, accessType, ip);
        if (null != clientKey) return Boolean.TRUE;
        return Boolean.FALSE;
    }
}
