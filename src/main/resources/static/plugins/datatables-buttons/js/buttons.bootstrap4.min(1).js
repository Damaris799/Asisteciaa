/*!
 Bootstrap integration for DataTables' Buttons
 ©2016 SpryMedia Ltd - datatables.net/license
*/
(function(c){"function"===typeof define&&define.amd?define(["jquery","datatables.net-bs4","datatables.net-buttons"],function(a){return c(a,window,document)}):"object"===typeof exports?module.exports=function(a,b){a||(a=window);b&&b.fn.dataTable||(b=require("datatables.net-bs4")(a,b).$);b.fn.dataTable.Buttons||require("datatables.net-buttons")(a,b);return c(b,a,a.document)}:c(jQuery,window,document)})(function(c,a,b,f){a=c.fn.dataTable;c.extend(!0,a.Buttons.defaults,{dom:{container:{className:"dt-buttons btn-group flex-wrap"},
button:{className:"btn btn-secondary"},collection:{tag:"div",className:"dropdown-menu",closeButton:!1,button:{tag:"a",className:"dt-button dropdown-item",active:"active",disabled:"disabled"}},splitWrapper:{tag:"div",className:"dt-btn-split-wrapper btn-group",closeButton:!1},splitDropdown:{tag:"button",text:"",className:"btn btn-secondary dt-btn-split-drop dropdown-toggle dropdown-toggle-split",closeButton:!1,align:"split-left",splitAlignClass:"dt-button-split-left"},splitDropdownButton:{tag:"button",
className:"dt-btn-split-drop-button btn btn-secondary",closeButton:!1}},buttonCreated:function(e,d){return e.buttons?c('<div class="btn-group"/>').append(d):d}});a.ext.buttons.collection.className+=" dropdown-toggle";a.ext.buttons.collection.rightAlignClassName="dropdown-menu-right";return a.Buttons});
