package com.xust.service;

import com.xust.mapper.MenuMapper;
import com.xust.mapper.MenuRoleMapper;
import com.xust.model.Hr;
import com.xust.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@CacheConfig(cacheNames = "menus_cache")
public class MenuService {
    @Autowired
    MenuMapper menuMapper;

    @Autowired
    MenuRoleMapper menuRoleMapper;

    public List<Menu> getMenusByHrId(){
        return menuMapper.getMenusByHrId(new Hr().getId());
    }

    @Cacheable
    public List<Menu> getAllMenuWithRole(){
        return menuMapper.getAllMenusWithRole();
    }

    public List<Menu> getAllMenus(){
        return menuMapper.getAllMenus();
    }

    public List<Integer> getMidsByRid(Integer rid){
        return menuMapper.getMidsByRid(rid);
    }

    @Transactional
    public boolean updateMenuRole(Integer rid,Integer[] mids){
        menuRoleMapper.deleteByRid(rid);
        if(mids == null || mids.length == 0){
            return true;
        }
        Integer result = menuRoleMapper.insertRecord(rid,mids);
        return result == mids.length;
    }
}