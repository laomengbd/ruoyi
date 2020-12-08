package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysCalendar;

/**
 * 工作日历Mapper接口
 * 
 * @author niaobulashi
 * @date 2020-11-25
 */
public interface SysCalendarMapper 
{
    /**
     * 查询工作日历
     * 
     * @param dateStr 工作日历ID
     * @return 工作日历
     */
    public SysCalendar selectSysCalendarById(String dateStr);

    /**
     * 查询工作日历列表
     * 
     * @param sysCalendar 工作日历
     * @return 工作日历集合
     */
    public List<SysCalendar> selectSysCalendarList(SysCalendar sysCalendar);

    /**
     * 新增工作日历
     * 
     * @param sysCalendar 工作日历
     * @return 结果
     */
    public int insertSysCalendar(SysCalendar sysCalendar);

    /**
     * 修改工作日历
     * 
     * @param sysCalendar 工作日历
     * @return 结果
     */
    public int updateSysCalendar(SysCalendar sysCalendar);

    /**
     * 删除工作日历
     * 
     * @param dateStr 工作日历ID
     * @return 结果
     */
    public int deleteSysCalendarById(String dateStr);

    /**
     * 批量删除工作日历
     * 
     * @param dateStrs 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysCalendarByIds(String[] dateStrs);
}
