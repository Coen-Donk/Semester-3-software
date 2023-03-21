using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Login_ORM
{
	public interface IAccountRepository
	{
		IEnumerable<Account> GetAccounts();
		bool insert(Account account);
		bool update(Account account);
		bool delete(Account account);

	}
}
