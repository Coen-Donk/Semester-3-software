using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace ORM_Console.Migrations
{
    /// <inheritdoc />
    public partial class Users : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_OrderItem_Product_Productid",
                table: "OrderItem");

            migrationBuilder.DropForeignKey(
                name: "FK_OrderItem_accounts_OrderId",
                table: "OrderItem");

            migrationBuilder.DropPrimaryKey(
                name: "PK_OrderItem",
                table: "OrderItem");

            migrationBuilder.DropPrimaryKey(
                name: "PK_accounts",
                table: "accounts");

            migrationBuilder.RenameTable(
                name: "OrderItem",
                newName: "Items");

            migrationBuilder.RenameTable(
                name: "accounts",
                newName: "Orders");

            migrationBuilder.RenameIndex(
                name: "IX_OrderItem_Productid",
                table: "Items",
                newName: "IX_Items_Productid");

            migrationBuilder.RenameIndex(
                name: "IX_OrderItem_OrderId",
                table: "Items",
                newName: "IX_Items_OrderId");

            migrationBuilder.AddPrimaryKey(
                name: "PK_Items",
                table: "Items",
                column: "OrderItemId");

            migrationBuilder.AddPrimaryKey(
                name: "PK_Orders",
                table: "Orders",
                column: "Id");

            migrationBuilder.CreateTable(
                name: "Users",
                columns: table => new
                {
                    UserId = table.Column<int>(type: "INTEGER", nullable: false)
                        .Annotation("Sqlite:Autoincrement", true),
                    FirstName = table.Column<string>(type: "TEXT", nullable: false),
                    Lastname = table.Column<string>(type: "TEXT", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Users", x => x.UserId);
                });

            migrationBuilder.AddForeignKey(
                name: "FK_Items_Orders_OrderId",
                table: "Items",
                column: "OrderId",
                principalTable: "Orders",
                principalColumn: "Id");

            migrationBuilder.AddForeignKey(
                name: "FK_Items_Product_Productid",
                table: "Items",
                column: "Productid",
                principalTable: "Product",
                principalColumn: "Productid",
                onDelete: ReferentialAction.Cascade);
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Items_Orders_OrderId",
                table: "Items");

            migrationBuilder.DropForeignKey(
                name: "FK_Items_Product_Productid",
                table: "Items");

            migrationBuilder.DropTable(
                name: "Users");

            migrationBuilder.DropPrimaryKey(
                name: "PK_Orders",
                table: "Orders");

            migrationBuilder.DropPrimaryKey(
                name: "PK_Items",
                table: "Items");

            migrationBuilder.RenameTable(
                name: "Orders",
                newName: "accounts");

            migrationBuilder.RenameTable(
                name: "Items",
                newName: "OrderItem");

            migrationBuilder.RenameIndex(
                name: "IX_Items_Productid",
                table: "OrderItem",
                newName: "IX_OrderItem_Productid");

            migrationBuilder.RenameIndex(
                name: "IX_Items_OrderId",
                table: "OrderItem",
                newName: "IX_OrderItem_OrderId");

            migrationBuilder.AddPrimaryKey(
                name: "PK_accounts",
                table: "accounts",
                column: "Id");

            migrationBuilder.AddPrimaryKey(
                name: "PK_OrderItem",
                table: "OrderItem",
                column: "OrderItemId");

            migrationBuilder.AddForeignKey(
                name: "FK_OrderItem_Product_Productid",
                table: "OrderItem",
                column: "Productid",
                principalTable: "Product",
                principalColumn: "Productid",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_OrderItem_accounts_OrderId",
                table: "OrderItem",
                column: "OrderId",
                principalTable: "accounts",
                principalColumn: "Id");
        }
    }
}
