package io.mjd507.common;

import io.mjd507.common.constants.Constants;
import io.mjd507.entity.UserVo;
import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * Created by mjd on 2018/4/21 22:29
 */
public class UserAttrSetter {

  @ModelAttribute
  public void putAttr(HttpServletRequest request, Model mode) {
    UserVo userVo = (UserVo) request.getAttribute(Constants.USER_ATTR);
    mode.addAttribute(Constants.USER_ATTR, userVo);
  }
}
