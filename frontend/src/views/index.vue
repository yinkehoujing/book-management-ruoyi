<template>
  <div class="app-container home">
<!--    <el-row :gutter="20">-->
<!--      <el-col :sm="24" :lg="24">-->
<!--        <blockquote class="text-warning" style="font-size: 14px">-->
<!--          领取阿里云通用云产品1888优惠券-->
<!--          <br />-->
<!--          <el-link-->
<!--            href="https://www.aliyun.com/minisite/goods?userCode=brki8iof"-->
<!--            type="primary"-->
<!--            target="_blank"-->
<!--            >https://www.aliyun.com/minisite/goods?userCode=brki8iof</el-link-->
<!--          >-->
<!--          <br />-->
<!--          领取腾讯云通用云产品2860优惠券-->
<!--          <br />-->
<!--          <el-link-->
<!--            href="https://cloud.tencent.com/redirect.php?redirect=1025&cps_key=198c8df2ed259157187173bc7f4f32fd&from=console"-->
<!--            type="primary"-->
<!--            target="_blank"-->
<!--            >https://cloud.tencent.com/redirect.php?redirect=1025&cps_key=198c8df2ed259157187173bc7f4f32fd&from=console</el-link-->
<!--          >-->
<!--          <br />-->
<!--          阿里云服务器折扣区-->
<!--          <el-link href="http://aly.ruoyi.vip" type="primary" target="_blank"-->
<!--            >>☛☛点我进入☚☚</el-link-->
<!--          >-->
<!--          &nbsp;&nbsp;&nbsp; 腾讯云服务器秒杀区-->
<!--          <el-link href="http://txy.ruoyi.vip" type="primary" target="_blank"-->
<!--            >>☛☛点我进入☚☚</el-link-->
<!--          ><br />-->
<!--          <h4 class="text-danger">-->
<!--            云产品通用红包，可叠加官网常规优惠使用。(仅限新用户)-->
<!--          </h4>-->
<!--        </blockquote>-->

<!--        <hr />-->
<!--      </el-col>-->
<!--    </el-row>-->
    <el-row :gutter="20">
      <el-col :sm="24" :lg="12" style="padding-left: 20px">
        <h2>图书后台管理框架</h2>
<!--        <p>-->
<!--          一直想做一款后台管理系统，看了很多优秀的开源项目但是发现没有合适自己的。于是利用空闲休息时间开始自己写一套后台系统。如此有了图书管理系统，她可以用于所有的Web应用程序，如网站管理后台，网站会员中心，CMS，CRM，OA等等，当然，您也可以对她进行深度定制，以做出更强系统。所有前端后台代码封装过后十分精简易上手，出错概率低。同时支持移动客户端访问。系统会陆续更新一些实用功能。-->
<!--        </p>-->
<!--        <p>-->
<!--          <b>当前版本:</b> <span>v{{ version }}</span>-->
<!--        </p>-->
<!--        <p>-->
<!--          <el-tag type="danger">&yen;免费开源</el-tag>-->
<!--        </p>-->
<!--        <p>-->
<!--          <el-button-->
<!--            type="primary"-->
<!--            icon="Cloudy"-->
<!--            plain-->
<!--            @click="goTarget('https://gitee.com/y_project/RuoYi-Vue')"-->
<!--            >访问码云</el-button-->
<!--          >-->
<!--          <el-button-->
<!--            icon="HomeFilled"-->
<!--            plain-->
<!--            @click="goTarget('http://ruoyi.vip')"-->
<!--            >访问主页</el-button-->
<!--          >-->
<!--        </p>-->
      </el-col>

      <el-col :sm="24" :lg="12" style="padding-left: 50px">
        <el-row>
          <el-col :span="12">
            <h2>技术选型</h2>
          </el-col>
        </el-row>
        <el-row>
          <el-col :span="6">
            <h4>后端技术</h4>
            <ul>
              <li>SpringBoot</li>
              <li>Spring Security</li>
              <li>JWT</li>
              <li>MyBatis</li>
              <li>Druid</li>
              <li>Fastjson</li>
              <li>...</li>
            </ul>
          </el-col>
          <el-col :span="6">
            <h4>前端技术</h4>
            <ul>
              <li>Vue</li>
              <li>Vuex</li>
              <li>Element-ui</li>
              <li>Axios</li>
              <li>Sass</li>
              <li>Quill</li>
              <li>...</li>
            </ul>
          </el-col>
        </el-row>
      </el-col>
    </el-row>
    <el-divider />
    <el-row :gutter="20">
      <el-col :xs="24" :sm="24" :md="12" :lg="8">
        <el-card class="update-log">
          <template v-slot:header>
            <div class="clearfix">
              <span>关于</span>
            </div>
          </template>
          <div class="body">
<!--            <p>-->
<!--              <i class="el-icon-s-promotion"></i> 官网：<el-link-->
<!--                href="http://www.ruoyi.vip"-->
<!--                target="_blank"-->
<!--                >http://www.ruoyi.vip</el-link-->
<!--              >-->
<!--            </p>-->
            <p>
<!--              <i class="el-icon-user-solid"></i> QQ群：<s> 满937441 </s> <s> 满887144332 </s>-->
<!--              <s> 满180251782 </s> <s> 满104180207 </s> <s> 满186866453 </s> <s> 满201396349 </s>-->
<!--              <s> 满101456076 </s> <s> 满101539465 </s> <s> 满264312783 </s> <s> 满167385320 </s> -->
<!--              <s> 满104748341 </s> <s> 满160110482 </s> <s> 满170801498 </s> <s> 满108482800 </s> -->
<!--              <s> 满101046199 </s> <s> 满136919097 </s> <s> 满143961921 </s> <s> 满174951577 </s> -->
<!--              <s> 满161281055 </s> <s> 满138988063 </s> <a href="http://qm.qq.com/cgi-bin/qm/qr?_wv=1027&k=SUc-msaypcqB2UTFif4eqGlBHkKcvMNP&authKey=JdQBouY2PG%2BS%2BCzAfIgbCGNgxyahpfh24IW%2F03rPxGilhqVbisLma%2FFFnt79DHNh&noverify=0&group_code=151450850" target="_blank">151450850</a>-->
            </p>
            <p>
<!--              <i class="el-icon-chat-dot-round"></i> 微信：<a-->
<!--                href="javascript:;"-->
<!--                >/ *若依</a-->
<!--              >-->
            </p>
            <p>
<!--              <i class="el-icon-money"></i> 支付宝：<a-->
<!--                href="javascript:;"-->
<!--                class="支付宝信息"-->
<!--                >/ *若依</a-->
<!--              >-->
            </p>
          </div>
        </el-card>
      </el-col>
      <el-col :xs="24" :sm="24" :md="12" :lg="8">
        <el-card class="update-log">
          <template v-slot:header>
            <div class="clearfix">
              <span>其它信息</span>
            </div>
          </template>
          <el-collapse accordion>
            <el-collapse-item title="公告-1">
<!--              <ol>-->
<!--                <li>菜单管理新增路由名称</li>-->
<!--                <li>新增数据脱敏过滤注解</li>-->
<!--                <li>用户密码新增非法字符验证</li>-->
<!--                <li>限制用户操作数据权限范围</li>-->
<!--                <li>代码生成新增创建表结构功能</li>-->
<!--                <li>定时任务白名单配置范围缩小</li>-->
<!--                <li>优化代码生成主子表关联查询方式</li>-->
<!--                <li>Excel注解新增属性comboReadDict</li>-->
<!--                <li>Excel注解ColumnType类型新增文本</li>-->
<!--                <li>新增国际化资源文件配置</li>-->
<!--                <li>升级oshi到最新版本6.6.1</li>-->
<!--                <li>升级druid到最新版本1.2.23</li>-->
<!--                <li>升级core-js到最新版本3.37.1</li>-->
<!--                <li>更新HttpUtils中的User-Agent</li>-->
<!--                <li>更新compressionPlugin到6.1.2以兼容node18+</li>-->
<!--                <li>升级spring-security到安全版本，防止漏洞风险</li>-->
<!--                <li>升级spring-framework到安全版本，防止漏洞风险</li>-->
<!--                <li>优化自定义XSS注解匹配方式</li>-->
<!--                <li>优化缓存监控键名列表排序显示</li>-->
<!--                <li>优化定时任务日志默认按时间排序</li>-->
<!--                <li>优化默认文件大小超过2G无效的问题</li>-->
<!--                <li>优化查表特殊字符使用反斜杠进行转义</li>-->
<!--                <li>优化定时任务cron表达式小时配置显示错误问题</li>-->
<!--                <li>优化多个自定数据权限使用in查询,避免多次拼接</li>-->
<!--                <li>优化导入Excel时设置dictType属性重复查缓存问题</li>-->
<!--                <li>其他细节优化</li>-->
<!--              </ol>-->
            </el-collapse-item>
            <el-collapse-item title="公告-2">
<!--              <ol>-->
<!--                <li>操作日志记录部门名称</li>-->
<!--                <li>全局数据存储用户编号</li>-->
<!--                <li>新增编程式判断资源访问权限</li>-->
<!--                <li>操作日志列表新增IP地址查询</li>-->
<!--                <li>定时任务新增页去除状态选项</li>-->
<!--                <li>代码生成支持选择前端模板类型</li>-->
<!--                <li>显隐列组件支持复选框弹出类型</li>-->
<!--                <li>通用排序属性orderBy参数限制长度</li>-->
<!--                <li>Excel自定义数据处理器增加单元格/工作簿对象</li>-->
<!--                <li>升级oshi到最新版本6.4.8</li>-->
<!--                <li>升级druid到最新版本1.2.20</li>-->
<!--                <li>升级fastjson到最新版2.0.43</li>-->
<!--                <li>升级pagehelper到最新版1.4.7</li>-->
<!--                <li>升级commons.io到最新版本2.13.0</li>-->
<!--                <li>升级element-ui到最新版本2.15.14</li>-->
<!--                <li>修复五级路由缓存无效问题</li>-->
<!--                <li>修复外链带端口出现的异常</li>-->
<!--                <li>修复树模板父级编码变量错误</li>-->
<!--                <li>修复字典表详情页面搜索问题</li>-->
<!--                <li>修复内链iframe没有传递参数问题</li>-->
<!--                <li>修复自定义字典样式不生效的问题</li>-->
<!--                <li>修复字典缓存删除方法参数错误问题</li>-->
<!--                <li>修复Excel导入数据临时文件无法删除问题</li>-->
<!--                <li>修复未登录带参数访问成功后参数丢失问题</li>-->
<!--                <li>修复HeaderSearch组件跳转query参数丢失问题</li>-->
<!--                <li>修复代码生成导入后必填项与数据库不匹配问题</li>-->
<!--                <li>修复Excels导入时无法获取到dictType字典值问题</li>-->
<!--                <li>优化下载zip方法新增遮罩层</li>-->
<!--                <li>优化头像上传参数新增文件名称</li>-->
<!--                <li>优化字典标签支持自定义分隔符</li>-->
<!--                <li>优化菜单管理类型为按钮状态可选</li>-->
<!--                <li>优化前端防重复提交数据大小限制</li>-->
<!--                <li>优化TopNav菜单没有图标svg不显示</li>-->
<!--                <li>优化数字金额大写转换精度丢失问题</li>-->
<!--                <li>优化富文本Editor组件检验图片格式</li>-->
<!--                <li>优化页签在Firefox浏览器被遮挡的问题</li>-->
<!--                <li>优化个人中心/基本资料修改时数据显示问题</li>-->
<!--                <li>优化缓存监控图表支持跟随屏幕大小自适应调整</li>-->
<!--                <li>其他细节优化</li>-->
<!--              </ol>-->
            </el-collapse-item>
            <el-collapse-item title="公告-3">
<!--              <ol>-->
<!--                <li>支持登录IP黑名单限制</li>-->
<!--                <li>新增监控页面图标显示</li>-->
<!--                <li>操作日志新增消耗时间属性</li>-->
<!--                <li>屏蔽定时任务bean违规的字符</li>-->
<!--                <li>日志管理使用索引提升查询性能</li>-->
<!--                <li>日志注解支持排除指定的请求参数</li>-->
<!--                <li>支持自定义隐藏属性列过滤子对象</li>-->
<!--                <li>升级oshi到最新版本6.4.3</li>-->
<!--                <li>升级druid到最新版本1.2.16</li>-->
<!--                <li>升级fastjson到最新版2.0.34</li>-->
<!--                <li>升级spring-boot到最新版本2.5.15</li>-->
<!--                <li>升级element-ui到最新版本2.15.13</li>-->
<!--                <li>移除apache/commons-fileupload依赖</li>-->
<!--                <li>修复页面切换时布局错乱的问题</li>-->
<!--                <li>修复匿名注解Anonymous空指针问题</li>-->
<!--                <li>修复路由跳转被阻止时内部产生报错信息问题</li>-->
<!--                <li>修复isMatchedIp的参数判断产生空指针的问题</li>-->
<!--                <li>修复用户多角色数据权限可能出现权限抬升的情况</li>-->
<!--                <li>修复开启TopNav后一级菜单路由参数设置无效问题</li>-->
<!--                <li>修复DictTag组件value没有匹配的值时则展示value</li>-->
<!--                <li>优化文件下载出现的异常</li>-->
<!--                <li>优化选择图标组件高亮回显</li>-->
<!--                <li>优化弹窗后导航栏偏移的问题</li>-->
<!--                <li>优化修改密码日志存储明文问题</li>-->
<!--                <li>优化页签栏关闭其他出现的异常问题</li>-->
<!--                <li>优化页签关闭左侧选项排除首页选项</li>-->
<!--                <li>优化关闭当前tab页跳转最右侧tab页</li>-->
<!--                <li>优化缓存列表清除操作提示不变的问题</li>-->
<!--                <li>优化字符未使用下划线不进行驼峰式处理</li>-->
<!--                <li>优化用户导入更新时需获取用户编号问题</li>-->
<!--                <li>优化侧边栏的平台标题与VUE_APP_TITLE保持同步</li>-->
<!--                <li>优化导出Excel时设置dictType属性重复查缓存问题</li>-->
<!--                <li>连接池Druid支持新的配置connectTimeout和socketTimeout</li>-->
<!--                <li>其他细节优化</li>-->
<!--              </ol>-->
            </el-collapse-item>
            <el-collapse-item title="公告-4">
<!--              <ol>-->
<!--                <li>定时任务违规的字符</li>-->
<!--                <li>重置时取消部门选中</li>-->
<!--                <li>新增返回警告消息提示</li>-->
<!--                <li>忽略不必要的属性数据返回</li>-->
<!--                <li>修改参数键名时移除前缓存配置</li>-->
<!--                <li>导入更新用户数据前校验数据权限</li>-->
<!--                <li>兼容Excel下拉框内容过多无法显示的问题</li>-->
<!--                <li>升级echarts到最新版本5.4.0</li>-->
<!--                <li>升级core-js到最新版本3.25.3</li>-->
<!--                <li>升级oshi到最新版本6.4.0</li>-->
<!--                <li>升级kaptcha到最新版2.3.3</li>-->
<!--                <li>升级druid到最新版本1.2.15</li>-->
<!--                <li>升级fastjson到最新版2.0.20</li>-->
<!--                <li>升级pagehelper到最新版1.4.6</li>-->
<!--                <li>优化弹窗内容过多展示不全问题</li>-->
<!--                <li>优化swagger-ui静态资源使用缓存</li>-->
<!--                <li>开启TopNav没有子菜单隐藏侧边栏</li>-->
<!--                <li>删除fuse无效选项maxPatternLength</li>-->
<!--                <li>优化导出对象的子列表为空会出现[]问题</li>-->
<!--                <li>优化编辑头像时透明部分会变成黑色问题</li>-->
<!--                <li>优化小屏幕上修改头像界面布局错位的问题</li>-->
<!--                <li>修复代码生成勾选属性无效问题</li>-->
<!--                <li>修复文件上传组件格式验证问题</li>-->
<!--                <li>修复回显数据字典数组异常问题</li>-->
<!--                <li>修复sheet超出最大行数异常问题</li>-->
<!--                <li>修复Log注解GET请求记录不到参数问题</li>-->
<!--                <li>修复调度日志点击多次数据不变化的问题</li>-->
<!--                <li>修复主题颜色在Drawer组件不会加载问题</li>-->
<!--                <li>修复文件名包含特殊字符的文件无法下载问题</li>-->
<!--                <li>修复table中更多按钮切换主题色未生效修复问题</li>-->
<!--                <li>修复某些特性的环境生成代码变乱码TXT文件问题</li>-->
<!--                <li>修复代码生成图片/文件/单选时选择必填无法校验问题</li>-->
<!--                <li>修复某些特性的情况用户编辑对话框中角色和部门无法修改问题</li>-->
<!--                <li>其他细节优化</li>-->
<!--              </ol>-->
            </el-collapse-item>
            <el-collapse-item title="公告-5">
<!--              <ol>-->
<!--                <li>数据逻辑删除不进行唯一验证</li>-->
<!--                <li>Excel注解支持导出对象的子列表方法</li>-->
<!--                <li>Excel注解支持自定义隐藏属性列</li>-->
<!--                <li>Excel注解支持backgroundColor属性设置背景色</li>-->
<!--                <li>支持配置密码最大错误次数/锁定时间</li>-->
<!--                <li>登录日志新增解锁账户功能</li>-->
<!--                <li>通用下载方法新增config配置选项</li>-->
<!--                <li>支持多权限字符匹配角色数据权限</li>-->
<!--                <li>页面内嵌iframe切换tab不刷新数据</li>-->
<!--                <li>操作日志记录支持排除敏感属性字段</li>-->
<!--                <li>修复多文件上传报错出现的异常问题</li>-->
<!--                <li>修复图片预览组件src属性为null值控制台报错问题</li>-->
<!--                <li>升级oshi到最新版本6.2.2</li>-->
<!--                <li>升级fastjson到最新版2.0.14</li>-->
<!--                <li>升级pagehelper到最新版1.4.3</li>-->
<!--                <li>升级core-js到最新版本3.25.2</li>-->
<!--                <li>升级element-ui到最新版本2.15.10</li>-->
<!--                <li>优化任务过期不执行调度</li>-->
<!--                <li>优化字典数据使用store存取</li>-->
<!--                <li>优化修改资料头像被覆盖的问题</li>-->
<!--                <li>优化修改用户登录账号重复验证</li>-->
<!--                <li>优化代码生成同步后值NULL问题</li>-->
<!--                <li>优化定时任务支持执行父类方法</li>-->
<!--                <li>优化用户个人信息接口防止修改部门</li>-->
<!--                <li>优化布局设置使用el-drawer抽屉显示</li>-->
<!--                <li>优化没有权限的用户编辑部门缺少数据</li>-->
<!--                <li>优化日志注解记录限制请求地址的长度</li>-->
<!--                <li>优化excel/scale属性导出单元格数值类型</li>-->
<!--                <li>优化日志操作中重置按钮时重复查询的问题</li>-->
<!--                <li>优化多个相同角色数据导致权限SQL重复问题</li>-->
<!--                <li>优化表格上右侧工具条（搜索按钮显隐&右侧样式凸出）</li>-->
<!--                <li>其他细节优化</li>-->
<!--              </ol>-->
            </el-collapse-item>
          </el-collapse>
        </el-card>
      </el-col>
      <el-col :xs="24" :sm="24" :md="12" :lg="8">
        <el-card class="update-log">
          <template v-slot:header>
            <div class="clearfix">
              <span>logo</span>
            </div>
          </template>
          <div class="body">
            <img
              src="@/assets/images/whulogo.png"
              alt="logo"
              style="width:100%"
            />
            <span style="display: inline-block; height: 30px; line-height: 30px"
              >first-try</span
            >
          </div>
        </el-card>
      </el-col>
    </el-row>
  </div>
</template>

<script setup name="Index">
const version = ref('3.8.8')

function goTarget(url) {
  window.open(url, '__blank')
}
</script>

<style scoped lang="scss">
.home {
  blockquote {
    padding: 10px 20px;
    margin: 0 0 20px;
    font-size: 17.5px;
    border-left: 5px solid #eee;
  }
  hr {
    margin-top: 20px;
    margin-bottom: 20px;
    border: 0;
    border-top: 1px solid #eee;
  }
  .col-item {
    margin-bottom: 20px;
  }

  ul {
    padding: 0;
    margin: 0;
  }

  font-family: "open sans", "Helvetica Neue", Helvetica, Arial, sans-serif;
  font-size: 13px;
  color: #676a6c;
  overflow-x: hidden;

  ul {
    list-style-type: none;
  }

  h4 {
    margin-top: 0px;
  }

  h2 {
    margin-top: 10px;
    font-size: 26px;
    font-weight: 100;
  }

  p {
    margin-top: 10px;

    b {
      font-weight: 700;
    }
  }

  .update-log {
    ol {
      display: block;
      list-style-type: decimal;
      margin-block-start: 1em;
      margin-block-end: 1em;
      margin-inline-start: 0;
      margin-inline-end: 0;
      padding-inline-start: 40px;
    }
  }
}
</style>

