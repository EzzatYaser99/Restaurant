export class Order {
  id:number;
  name:string;
  date_create:Date;
  date_update:Date;
  description:string;
  image:string;
  price:number;

  constructor(id: number, name: string, date_create: Date, date_update: Date, description: string, image: string, price: number) {
    this.id = id;
    this.name = name;
    this.date_create = date_create;
    this.date_update = date_update;
    this.description = description;
    this.image = image;
    this.price = price;
  }
}
