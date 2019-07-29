package cn.gg3083.blog.persistence.beans;

import cn.gg3083.blog.framework.object.AbstractDO;
import lombok.Data;
import lombok.experimental.Accessors;

/***
 *
 * @author Gimi
 * @date 2019/7/29 11:07
 *
 ***/
@Data
@Accessors(chain = true)
public class BizLog extends AbstractDO {

    private String ipaddr;
    private String address;

    public String getIpaddr() {
        return ipaddr;
    }

    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
