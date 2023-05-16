package com.hi.deptspring.deptspring.mapper;

import com.hi.deptspring.deptspring.domain.DeptDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {
    
    // 전체 부서 리스트
    List<DeptDTO> selectAll();

    // deptno 컬럼으로 검색 -> DeptDTO
    DeptDTO selectByDeptno(int deptno);
    
}
