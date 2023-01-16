import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { OrderItemsComponent } from './componants/order-items/order-items.component';
import {HttpClientModule} from "@angular/common/http";
import { CategoryItemsComponent } from './componants/category-items/category-items.component';
import {RouterModule, Routes} from "@angular/router";
import { DropdownMenuComponent } from './componants/dropdown-menu/dropdown-menu.component';
import { SerachOrderComponent } from './componants/serach-order/serach-order.component';

//http://localhost:4200
const routes:Routes=[


  //http://localhost:4200/category/id
  {path:'category/:id',component:OrderItemsComponent},

  //http://localhost:4200/category/key
  {path:'category',component:OrderItemsComponent},

  //http://localhost:4200/orders/key
  {path:'orders/:key',component:OrderItemsComponent},


  //http://localhost:4200/orders
  {path:'orders',component:OrderItemsComponent},

  //http://localhost:4200/s
  {path:'',redirectTo:'/orders',pathMatch:'full'},

  // if User enter any thing without all routes
  {path:'**',redirectTo:'/orders',pathMatch:'full'},

]
@NgModule({
  declarations: [
    AppComponent,
    OrderItemsComponent,
    CategoryItemsComponent,
    DropdownMenuComponent,
    SerachOrderComponent
  ],
  imports: [
    RouterModule.forRoot(routes),
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [


  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
